package gr.makris.wrenchWizard.data.category

import gr.makris.wrenchWizard.data.common.Model
import jakarta.persistence.*

@Entity
@Table(name = "subcategories")
data class SubCategoriesEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subcategoryid", nullable = true)
    var subCategoryId: Int,

    @Column(name = "title", nullable = true)
    var title: String = Model.INVALID_STRING,

    @Column(name = "categoryid", nullable = true)
    var categoryId: Int = Model.INVALID_INT

)