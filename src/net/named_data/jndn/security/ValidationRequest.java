/**
 * Copyright (C) 2013-2016 Regents of the University of California.
 * @author: Jeff Thompson <jefft0@remap.ucla.edu>
 * @author: From code in ndn-cxx by Yingdi Yu <yingdi@cs.ucla.edu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * A copy of the GNU Lesser General Public License is in the file COPYING.
 */

package net.named_data.jndn.security;

import net.named_data.jndn.Interest;

public class ValidationRequest {
  public ValidationRequest(Interest interest, OnVerified onVerified, OnVerifyFailed onVerifyFailed, int retry, int stepCount)
  {
    interest_ = interest;
    onVerified_ = onVerified;
    onVerifyFailed_ = onVerifyFailed;
    retry_ = retry;
    stepCount_ = stepCount;
  }

  public final Interest interest_;             // An interest packet to fetch the requested data.
  public final OnVerified onVerified_;         // A callback function if the requested certificate has been validated.
  public final OnVerifyFailed onVerifyFailed_; // A callback function if the requested certificate cannot be validated.
  public final int retry_;                     // The number of retrials when there is an interest timeout.
  public final int stepCount_;
}
