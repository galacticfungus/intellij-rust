package org.rust.lang.core.psi.util

import org.rust.lang.core.psi.RustFieldDeclElement
import org.rust.lang.core.psi.RustGenericDeclaration
import org.rust.lang.core.psi.RustStructItemElement
import org.rust.lang.core.psi.RustTypeParamElement

/**
 *  `RustItemElement` related extensions
 */

val RustStructItemElement.fields: List<RustFieldDeclElement>
    get() = blockFields?.fieldDeclList.orEmpty()

val RustGenericDeclaration.typeParams: List<RustTypeParamElement>
    get() = genericParams?.typeParamList.orEmpty()
