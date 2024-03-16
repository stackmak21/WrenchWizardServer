package gr.makris.wrenchWizard.service.selections

import gr.makris.wrenchWizard.data.selections.StepSelectionEntity
import gr.makris.wrenchWizard.data.selections.StepTitleEntity
import gr.makris.wrenchWizard.repository.StepSelectionsRepository
import gr.makris.wrenchWizard.repository.StepTitlesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StepSelectionsService(@Autowired private val stepSelectionsRepository: StepSelectionsRepository) {

    fun getAllStepSelections(id: Int): List<StepSelectionEntity> {
        return stepSelectionsRepository.findBySubcategoryId(id)
    }


}