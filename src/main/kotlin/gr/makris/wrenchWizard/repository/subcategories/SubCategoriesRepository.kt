package gr.makris.wrenchWizard.repository.subcategories

import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.data.mechanic.MechanicEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface SubCategoriesRepository : JpaRepository<SubCategoriesEntity, String> {
    // Custom queries can be defined here
    @Query("SELECT * FROM subcategories WHERE categoryid = :categoryid", nativeQuery = true)
    fun findByCategoryId(@Param("categoryid") categoryid: Int): List<SubCategoriesEntity>
}