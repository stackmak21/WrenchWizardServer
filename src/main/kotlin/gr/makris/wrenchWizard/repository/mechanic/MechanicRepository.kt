package gr.makris.wrenchWizard.repository.mechanic

import gr.makris.wrenchWizard.data.mechanic.MechanicEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface MechanicRepository : JpaRepository<MechanicEntity, String> {
    // Custom queries can be defined here
    @Query("SELECT * FROM mechanics WHERE category = :category", nativeQuery = true)
    fun findByDepartment(@Param("category") department: String): List<MechanicEntity>
}