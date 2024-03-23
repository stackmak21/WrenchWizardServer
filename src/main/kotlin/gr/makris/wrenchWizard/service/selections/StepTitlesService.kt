package gr.makris.wrenchWizard.service.selections

import gr.makris.wrenchWizard.data.dto.steps.StepsDto
import gr.makris.wrenchWizard.data.selections.StepSelectionEntity
import gr.makris.wrenchWizard.data.selections.StepTitleEntity
import gr.makris.wrenchWizard.mapper.toStepDto
import gr.makris.wrenchWizard.mapper.toStepSelectionDto
import gr.makris.wrenchWizard.repository.StepSelectionsRepository
import gr.makris.wrenchWizard.repository.StepTitlesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StepTitlesService(
    @Autowired private val stepTitlesRepository: StepTitlesRepository,
    @Autowired private val stepSelectionsRepository: StepSelectionsRepository
) {

    fun getSubcategorySteps(subCategoryId: Int): List<StepsDto> {
        val stepsDtoList: ArrayList<StepsDto> = arrayListOf()

        val stepTitles = stepTitlesRepository.findBySubCategoryId(subCategoryId)
        stepTitles.forEach { stepTitle ->
            val stepsSelections = getStepSelectionsForStepTitle(stepTitle)
            val stepDto = stepTitle.toStepDto(
                stepsSelections.map { it.toStepSelectionDto() }
            )
            stepsDtoList.add(stepDto)
        }

        if (stepsDtoList.isEmpty()) {
            throw Exception("Not found")
        }
        return stepsDtoList
    }

    private fun getStepSelectionsForStepTitle(stepTitle: StepTitleEntity): List<StepSelectionEntity> {
        return stepSelectionsRepository.findByStepTitleId(stepTitle.stepTitleId)
    }

    fun getAllStepTitles(id: Int): List<StepTitleEntity> {
        return stepTitlesRepository.findBySubCategoryId(id)
    }


}