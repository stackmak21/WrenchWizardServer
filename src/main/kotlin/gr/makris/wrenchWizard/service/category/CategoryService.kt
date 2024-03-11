package gr.makris.wrenchWizard.service.category

import gr.makris.wrenchWizard.data.category.CategoryEntity
import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.repository.category.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryService(@Autowired private val categoryRepository: CategoryRepository) {
    fun saveCategory(category: CategoryEntity): CategoryEntity = categoryRepository.save(category)

    fun getAllCategories(): List<CategoryEntity> {
        return categoryRepository.findAll()
    }

//    fun findByDepartment(category: MechanicCategoryEnum): List<MechanicEntity>{
//        return  mechanicRepository.findByDepartment(category.name)
//    }
    // Other service methods
}