package gr.makris.wrenchWizard.service.selections

import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.data.selections.StepTitleEntity
import gr.makris.wrenchWizard.repository.StepTitlesRepository
import gr.makris.wrenchWizard.repository.subcategories.SubCategoriesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StepTitlesService(@Autowired private val stepTitlesRepository: StepTitlesRepository) {

    fun getAllStepTitles(id: Int): List<StepTitleEntity> {
        return stepTitlesRepository.findBySubCategoryId(id)
    }


}