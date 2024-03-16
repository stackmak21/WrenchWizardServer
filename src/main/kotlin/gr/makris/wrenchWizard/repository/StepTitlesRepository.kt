package gr.makris.wrenchWizard.repository

import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.data.selections.StepTitleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface StepTitlesRepository: JpaRepository<StepTitleEntity, String> {
    @Query("SELECT * FROM steptitles WHERE subcategoryid = :subcategoryid", nativeQuery = true)
    fun findBySubCategoryId(@Param("subcategoryid") subcategoryid: Int): List<StepTitleEntity>
}