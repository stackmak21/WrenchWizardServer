package gr.makris.wrenchWizard.data.dto.steps

import gr.makris.wrenchWizard.data.common.Model

data class StepsDto(
    val stepTitleId: Int = Model.INVALID_INT,
    val title: String = Model.INVALID_STRING,
    val step: Int = Model.INVALID_INT,
    val subCategoryId: Int = Model.INVALID_INT,
    val stepSelections: List<StepSelectionDto> = emptyList()
)

data class StepSelectionDto(
    val stepSelectionId: Int = Model.INVALID_INT,
    val name: String = Model.INVALID_STRING,
    val stepTitleId: Int = Model.INVALID_INT,
    val subcategoryId: Int = Model.INVALID_INT
)
