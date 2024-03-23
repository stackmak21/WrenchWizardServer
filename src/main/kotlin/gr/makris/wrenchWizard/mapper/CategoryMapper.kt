package gr.makris.wrenchWizard.mapper

import gr.makris.wrenchWizard.data.category.CategoryEntity
import gr.makris.wrenchWizard.data.dto.CategoryDto

fun CategoryEntity.toCategoryDto(): CategoryDto {
    return CategoryDto(
        categoryId = this.categoryid,
        title = this.title
    )
}