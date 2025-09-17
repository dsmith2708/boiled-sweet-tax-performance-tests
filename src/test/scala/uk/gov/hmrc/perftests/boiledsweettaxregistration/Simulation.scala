/*
 * Copyright 2023 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.perftests.boiledsweettaxregistration

import uk.gov.hmrc.performance.simulation.PerformanceTestRunner

class Simulation extends PerformanceTestRunner {

  setup(" boiled-sweet-tax-registration", "Boiled Sweet Tax Registration Journey") withRequests {

    Requests.navigateToHomePage
    Requests.submitHomePage
    // TODO - add your requests here
    Requests.navigateToNamePage
    Requests.submitNamePage
    Requests.navigateToAddressPage

  }

  runSimulation()

}
