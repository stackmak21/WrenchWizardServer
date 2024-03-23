package gr.makris.wrenchWizard.controllers

import gr.makris.wrenchWizard.data.category.SubCategoriesEntity
import gr.makris.wrenchWizard.data.dto.steps.StepsDto
import gr.makris.wrenchWizard.data.selections.StepSelectionEntity
import gr.makris.wrenchWizard.data.selections.StepTitleEntity
import gr.makris.wrenchWizard.service.selections.StepSelectionsService
import gr.makris.wrenchWizard.service.selections.StepTitlesService
import gr.makris.wrenchWizard.service.subcategories.SubCategoriesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SelectionsController {


    @Autowired
    private lateinit var stepSelectionsService: StepSelectionsService

    @Autowired
    private lateinit var stepTitlesService: StepTitlesService

    @GetMapping("/getSteps/{subCategoryId}")
    fun getSteps(@PathVariable subCategoryId: Int): ResponseEntity<List<StepsDto>> {
        val stepTitles = stepTitlesService.getSubcategorySteps(subCategoryId)
        return ResponseEntity.ok(stepTitles)
    }

    @GetMapping("/getsubcategorytitles/{subCategoryId}")
    fun getAllTitlesById(@PathVariable subCategoryId: Int): ResponseEntity<List<StepTitleEntity>> {
        val stepTitles = stepTitlesService.getAllStepTitles(subCategoryId)
        return ResponseEntity.ok(stepTitles)
    }

    @GetMapping("/gettitleselections/{id}")
    fun getAllSelectionsBySubcategoryId(@PathVariable id: Int): ResponseEntity<List<StepSelectionEntity>> {
        val stepSelections = stepSelectionsService.getAllStepSelections(id)
        return ResponseEntity.ok(stepSelections)
    }


}