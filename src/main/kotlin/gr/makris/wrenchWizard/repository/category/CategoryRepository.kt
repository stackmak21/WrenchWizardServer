package gr.makris.wrenchWizard.repository.category

import gr.makris.wrenchWizard.data.category.CategoryEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<CategoryEntity, String> {
    // Custom queries can be defined here

}