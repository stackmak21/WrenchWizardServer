package gr.makris.wrenchWizard.data.mechanic

import gr.makris.wrenchWizard.data.common.Model
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "mechanics")
data class MechanicEntity(
    @Id
    @Column(name = "mechanicid", nullable = true)
    var mechanicId: String = UUID.randomUUID().toString(),

    @Column(name = "firstname", nullable = true)
    var firstName: String = Model.INVALID_STRING,

    @Column(name = "lastname", nullable = true)
    var lastName: String = Model.INVALID_STRING,

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    var category: MechanicCategoryEnum,

    @Column(name = "rating", nullable = true)
    var rating: Int = Model.INVALID_INT,

    @Column(name = "company", nullable = true)
    var company: String = Model.INVALID_STRING,

    @Column(name = "phone", nullable = true)
    var phone: String = Model.INVALID_STRING,

    @Column(name = "address", nullable = true)
    var address: String = Model.INVALID_STRING,

    @Column(name = "city", nullable = true)
    var city: String = Model.INVALID_STRING,

    @Column(name = "postalcode", nullable = true)
    var postalCode: String = Model.INVALID_STRING

)