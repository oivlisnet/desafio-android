package com.silvioapps.githubkotlin.features.details.models

import java.io.Serializable
import javax.inject.Singleton

@Singleton
data class DetailsModel(
	val title: String? = null,
	val body: String? = null,
	val html_url: String? = null,
	val user: User? = null
): Serializable
