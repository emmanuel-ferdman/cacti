/**
 * Hyperledger Core API
 *
 * Contains/describes the core API types for Cactus. Does not describe actual endpoints on its own as this is left to the implementing plugins who can import and re-use commonly needed type definitions from this specification. One example of said commonly used type definitions would be the types related to consortium management, cactus nodes, ledgers, etc..
 *
 * The version of the OpenAPI document: 0.2.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * A JSON Web Signature. See: https://tools.ietf.org/html/rfc7515 for info about standard.
 *
 * @param signature 
 * @param `protected` 
 * @param header 
 */

data class JWSRecipient (

    @Json(name = "signature")
    val signature: kotlin.String,

    @Json(name = "protected")
    val `protected`: kotlin.String? = null,

    @Json(name = "header")
    val header: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)
