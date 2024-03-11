package gr.makris.wrenchWizard.data.category

import gr.makris.wrenchWizard.data.common.Model
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "categories")
data class CategoryEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryid", nullable = true)
    var categoryid: Int,

    @Column(name = "title", nullable = true)
    var title: String = Model.INVALID_STRING,

)