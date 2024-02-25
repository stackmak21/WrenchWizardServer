package gr.makris.wrenchWizard.controllers

import gr.makris.wrenchWizard.data.category.CategoryEntity
import gr.makris.wrenchWizard.service.category.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class CategoriesController {


    @Autowired
    private lateinit var categoryService: CategoryService

    @PostMapping("/categories")
    fun saveCategory(@RequestBody category: CategoryEntity): ResponseEntity<CategoryEntity> {
        val savedCategory = categoryService.saveCategory(category)
        return ResponseEntity.ok(savedCategory)
    }

    @GetMapping("/getcategories")
    fun getAllCategories(): ResponseEntity<List<CategoryEntity>> {
        val categories = categoryService.getAllCategories()
        return ResponseEntity.ok(categories)
    }
}

////    @GetMapping("/getmechanics/{department}")
////    fun getSpecificMechanics(@PathVariable department: MechanicCategoryEnum): ResponseEntity<List<MechanicEntity>> {
////        val mechanics = mechanicService.findByDepartment(department)
////        return ResponseEntity.ok(mechanics)
////    }
//
//
//
//}
//
