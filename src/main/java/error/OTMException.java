/**
 * Copyright (c) 2018, Gabriel Gomes (gomes@me.berkeley.edu)
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

package error;

import java.io.Serializable;

public class OTMException extends Exception implements Serializable {

    public OTMException(String string){
        super(string);
    }

    public OTMException(String message, Throwable cause) {
        super(message, cause);
    }

    public OTMException(Throwable exc) {
        super(exc);
    }

}
