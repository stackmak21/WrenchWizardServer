package gr.makris.wrenchWizard.service.subcategories

import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.repository.subcategories.SubCategoriesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SubCategoriesService(@Autowired private val subCategoriesRepository: SubCategoriesRepository) {

    fun getAllSubCategories(id: Int): List<SubCategoriesEntity> {
        return subCategoriesRepository.findByCategoryId(id)
    }


}