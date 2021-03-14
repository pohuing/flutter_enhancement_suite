package de.mariushoefler.flutterenhancementsuite.exceptions

import com.google.gson.JsonSyntaxException
import java.io.IOException

class GetLatestPackageVersionException(p: String) :
    Exception("Cannot get the latest version number for package: $p")

class GetCurrentPackageVersionException(p: String) :
    Exception("Cannot read current version number for package: $p")

class GetPackageNameException(p: String) :
    Exception("Cannot read package name for package: $p")

class PubApiCouldNotBeReached(p: IOException) : Exception("Pub api could not be reached: $p")

class PubApiUnknownFormat(p: JsonSyntaxException) : Exception("Unexpected response from Pub api: $p")
