package gr.makris.wrenchWizard.data

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MechanicService(@Autowired private val mechanicRepository: MechanicRepository) {
    fun saveMechanic(mechanic: MechanicEntity): MechanicEntity = mechanicRepository.save(mechanic)

    fun getAllMechanics(): List<MechanicEntity> {
        return mechanicRepository.findAll()
    }

    fun findByDepartment(category: MechanicCategoryEnum): List<MechanicEntity>{
        return  mechanicRepository.findByDepartment(category.name)
    }
    // Other service methods
}