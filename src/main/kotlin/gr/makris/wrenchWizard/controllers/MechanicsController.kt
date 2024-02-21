package gr.makris.wrenchWizard.controllers

import gr.makris.wrenchWizard.data.mechanic.MechanicCategoryEnum
import gr.makris.wrenchWizard.data.mechanic.MechanicEntity
import gr.makris.wrenchWizard.service.mechanic.MechanicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MechanicsController {

    @Autowired
    private lateinit var mechanicService: MechanicService

    @PostMapping("/mechanics")
    fun saveMechanic(@RequestBody mechanic: MechanicEntity): ResponseEntity<MechanicEntity>{
        val savedMechanic = mechanicService.saveMechanic(mechanic)
        return ResponseEntity.ok(savedMechanic)
    }

    @GetMapping("/getmechanics")
    fun getAllMechanics(): ResponseEntity<List<MechanicEntity>>{
        val mechanics = mechanicService.getAllMechanics()
        return ResponseEntity.ok(mechanics)
    }

    @GetMapping("/getmechanics/{department}")
    fun getSpecificMechanics(@PathVariable department: MechanicCategoryEnum): ResponseEntity<List<MechanicEntity>>{
        val mechanics = mechanicService.findByDepartment(department)
        return ResponseEntity.ok(mechanics)
    }



}
