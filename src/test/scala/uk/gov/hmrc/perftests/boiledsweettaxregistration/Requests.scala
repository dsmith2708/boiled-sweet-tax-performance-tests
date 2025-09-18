/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.perftests.boiledsweettaxregistration

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import uk.gov.hmrc.performance.conf.ServicesConfiguration

object Requests extends ServicesConfiguration {

  val baseUrl: String = baseUrlFor("boiled-sweet-tax-registration-frontend")
  val route: String = "/register-for-boiled-sweet-tax"

  // Home Page
  val navigateToHomePage: HttpRequestBuilder =
    http("Navigate to Home Page")
      .get(s"$baseUrl$route")
      .check(status.is(200))
      .check(css("input[name=csrfToken]", "value").saveAs("csrfToken"))

  val submitHomePage: HttpRequestBuilder =
    http("Enter the service proper")
      .post(s"$baseUrl$route")
      .check(status.is(303))
      .check(header("Location").is("/register-for-boiled-sweet-tax/business-name").saveAs("businessNamePage"))

  // Name page
  val navigateToNamePage: HttpRequestBuilder =
    http("Navigate to Name Page")
      .get(s"$baseUrl$route")
      .check(status.is(200))
      .check(css("input[name=csrfToken]", "value").saveAs("csrfToken"))

  val submitNamePage: HttpRequestBuilder =
    http("Enter the service proper")
      .post(s"$baseUrl$route")
      .check(status.is(303))
      .check(header("Location").is("/register-for-boiled-sweet-tax/business-date").saveAs("businessDatePage"))

  // Date page
  val navigateToDatePage: HttpRequestBuilder =
    http("Navigate to Date Page")
      .get(s"$baseUrl$route")
      .check(status.is(200))
      .check(css("input[name=csrfToken]", "value").saveAs("csrfToken"))

  val submitDatePage: HttpRequestBuilder =
    http("Enter the service proper")
      .post(s"$baseUrl$route")
      .check(status.is(303))
      .check(header("Location").is("/register-for-boiled-sweet-tax/business-address").saveAs("businessAddressPage"))

  // Address page
  val navigateToAddressPage: HttpRequestBuilder =
    http("Navigate to Address Page")
      .get(s"$baseUrl$route")
      .check(status.is(200))
      .check(css("input[name=csrfToken]", "value").saveAs("csrfToken"))

  val submitAddressPage: HttpRequestBuilder =
    http("Enter the service proper")
      .post(s"$baseUrl$route")
      .check(status.is(303))
      .check(header("Location").is("/register-for-boiled-sweet-tax/check-answers").saveAs("CheckAnswersPage"))

  val navigateToCheckAnswersPage: HttpRequestBuilder =
    http("Navigate to Check Answers Page")
      .get(s"$baseUrl$route")
      .check(status.is(200))
      .check(css("input[name=csrfToken]", "value").saveAs("csrfToken"))
}
