package gr.makris.wrenchWizard.data.mechanic

import gr.makris.wrenchWizard.data.mechanic.MechanicCategoryEnum

data class Mechanic(
    val mechanicId: String,
    val firstName: String,
    val lastName: String,
    val category: MechanicCategoryEnum,
    var rating: Int,
    val company: String?,
    val phone: String,
    val address: String,
    val city: String,
    val postalCode: String
)
