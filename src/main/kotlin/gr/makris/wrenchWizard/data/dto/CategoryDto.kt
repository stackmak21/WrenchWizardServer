package gr.makris.wrenchWizard.data.dto

import gr.makris.wrenchWizard.data.common.Model
import jakarta.persistence.Column

data class CategoryDto(
    val categoryId: Int = -1,
    val title: String = Model.INVALID_STRING,
)
