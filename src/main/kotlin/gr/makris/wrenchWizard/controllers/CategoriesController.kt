package gr.makris.wrenchWizard.controllers

import gr.makris.wrenchWizard.data.category.CategoryEntity
import gr.makris.wrenchWizard.data.mechanic.MechanicCategoryEnum
import gr.makris.wrenchWizard.data.mechanic.MechanicEntity
import gr.makris.wrenchWizard.service.category.CategoryService
import gr.makris.wrenchWizard.service.mechanic.MechanicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

class CategoriesController {


    @Autowired
    private lateinit var categoryService: CategoryService

    @PostMapping("/categories")
    fun saveCategory(@RequestBody category: CategoryEntity): ResponseEntity<CategoryEntity> {
        val savedCategory = categoryService.saveCategory(category)
        return ResponseEntity.ok(savedCategory)
    }

    @GetMapping("/getcategories")
    fun getAllMechanics(): ResponseEntity<List<CategoryEntity>> {
        val categories = categoryService.getAllCategories()
        return ResponseEntity.ok(categories)
    }

//    @GetMapping("/getmechanics/{department}")
//    fun getSpecificMechanics(@PathVariable department: MechanicCategoryEnum): ResponseEntity<List<MechanicEntity>> {
//        val mechanics = mechanicService.findByDepartment(department)
//        return ResponseEntity.ok(mechanics)
//    }



}

