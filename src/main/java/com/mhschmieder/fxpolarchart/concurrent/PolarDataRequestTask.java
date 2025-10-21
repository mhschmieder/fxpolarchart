/**
 * MIT License
 *
 * Copyright (c) 2020, 2024 Mark Schmieder
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * This file is part of the FxPolarChart Library
 *
 * You should have received a copy of the MIT License along with the FxPolarChart
 * Library. If not, see <https://opensource.org/licenses/MIT>.
 *
 * Project: https://github.com/mhschmieder/fxpolarchart
 */
package com.mhschmieder.fxpolarchart.concurrent;

import com.mhschmieder.fxconcurrent.DataRequestTask;
import com.mhschmieder.jcommons.net.DataRequestParameters;
import com.mhschmieder.jcommons.net.HttpServletRequestProperties;
import com.mhschmieder.jcommons.util.ClientProperties;
import com.mhschmieder.jcommons.util.DataUpdateType;

/**
 * This is a task wrapper for Polar Response prediction server requests.
 */
public final class PolarDataRequestTask extends DataRequestTask {

    public PolarDataRequestTask( final HttpServletRequestProperties pServerRequestProperties,
                                 final DataRequestParameters pDataRequestParameters,
                                 final ClientProperties pClientProperties ) {
        // Always call the super-constructor first!
        super( pServerRequestProperties,
               pDataRequestParameters,
               pClientProperties );
    }
    
    @Override
    public String getTaskTitle() {
        String taskTitle = "";
        
        final DataUpdateType dataUpdateType = getDataUpdateType();
        switch ( dataUpdateType ) {
        case DYNAMIC_UPDATE:
            break;
        case FULL_UPDATE:
            taskTitle = "Polar Response Update";
            break;
        default:
            break;
        }
        
        return taskTitle;
    }
}
