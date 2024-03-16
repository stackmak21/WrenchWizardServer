package gr.makris.wrenchWizard.repository

import gr.makris.wrenchWizard.data.selections.StepSelectionEntity
import gr.makris.wrenchWizard.data.selections.StepTitleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface StepSelectionsRepository: JpaRepository<StepSelectionEntity, String> {
    @Query("SELECT * FROM stepselections WHERE subcategoryid = :subcategoryid", nativeQuery = true)
    fun findBySubcategoryId(@Param("subcategoryid") subcategoryid: Int): List<StepSelectionEntity>
}