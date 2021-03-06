/*
 * Copyright (c) 2020 Contributors as noted in the AUTHORS.md file
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package ex.ample.httpstapir

import eu.timepit.refined.api._
import eu.timepit.refined.cats._
import eu.timepit.refined.collection._

package object models {

  type GreetingTitle = String Refined NonEmpty
  object GreetingTitle extends RefinedTypeOps[GreetingTitle, String] with CatsRefinedTypeOpsSyntax

  type GreetingHeader = String Refined NonEmpty
  object GreetingHeader extends RefinedTypeOps[GreetingHeader, String] with CatsRefinedTypeOpsSyntax

  type GreetingMessage = String Refined NonEmpty
  object GreetingMessage extends RefinedTypeOps[GreetingMessage, String] with CatsRefinedTypeOpsSyntax

}
