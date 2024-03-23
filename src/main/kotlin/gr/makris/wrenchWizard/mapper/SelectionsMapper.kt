package gr.makris.wrenchWizard.mapper

import gr.makris.wrenchWizard.data.dto.steps.StepSelectionDto
import gr.makris.wrenchWizard.data.dto.steps.StepsDto
import gr.makris.wrenchWizard.data.selections.StepSelectionEntity
import gr.makris.wrenchWizard.data.selections.StepTitleEntity

fun StepTitleEntity.toStepDto(stepsSelections: List<StepSelectionDto>): StepsDto {
    return StepsDto(
        stepTitleId = this.stepTitleId,
                title = this.title,
                step = this.step,
                subCategoryId = this.subCategoryId,
                stepSelections = stepsSelections
    )
}

fun StepSelectionEntity.toStepSelectionDto(): StepSelectionDto {
    return StepSelectionDto(
        stepSelectionId = this.stepSelectionId,
                name = this.name,
                stepTitleId = this.stepTitleId,
                subcategoryId = this.subcategoryId
    )
}