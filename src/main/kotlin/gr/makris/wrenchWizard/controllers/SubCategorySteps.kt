package gr.makris.wrenchWizard.controllers

import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.service.subcategories.SubCategoryStepsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
class SubCategorySteps {


    @Autowired
    private lateinit var subCategoryStepsService: SubCategoryStepsService

    @GetMapping("/getselectionstitle/{id}")
    fun getAllSubCategoriesById(@PathVariable id: Int): ResponseEntity<List<SubCategoriesEntity>> {
        val subCategories = subCategoryStepsService.getAllSubCategories(id)
        return ResponseEntity.ok(subCategories)
    }
}

