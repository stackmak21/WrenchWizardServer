package gr.makris.wrenchWizard.controllers

import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.service.subcategories.SubCategoriesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
class SubCategoriesController {


    @Autowired
    private lateinit var subCategoriesService: SubCategoriesService
    

    @GetMapping("/getsubcategories/{id}")
    fun getAllSubCategoriesById(@PathVariable id: Int): ResponseEntity<List<SubCategoriesEntity>> {
        val subCategories = subCategoriesService.getAllSubCategories(id)
        return ResponseEntity.ok(subCategories)
    }


}

