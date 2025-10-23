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
package com.mhschmieder.fxpolarchart.action;

import com.mhschmieder.fxcontrols.action.XActionGroup;
import com.mhschmieder.jcommons.util.ClientProperties;
import org.controlsfx.control.action.Action;

import java.util.Arrays;
import java.util.Collection;

/**
 * This is a struct-like container for View actions used by Polar Response.
 */
public final class PolarResponseViewActions {

    public PolarResponseAmplitudeScaleChoices _scaleChoices;

    public PolarResponseViewActions( final ClientProperties pClientProperties ) {
        _scaleChoices = new PolarResponseAmplitudeScaleChoices( pClientProperties );
    }

    public Collection< Action > getScaleChoiceCollection() {
        // Forward this method to the Scale choices container.
        return _scaleChoices.getScaleChoiceCollection();
    }

    public Collection< Action > getViewActionCollection( final ClientProperties pClientProperties ) {
        final XActionGroup scaleChoiceGroup = PolarResponseLabeledActionFactory
                .getScaleChoiceGroup( pClientProperties, _scaleChoices );

        final Collection< Action > viewActionCollection = Arrays.asList( scaleChoiceGroup );

        return viewActionCollection;
    }

    public void setGridSpacing( final int gridSpacing ) {
        // Forward this method to the Scale choices container.
        _scaleChoices.setGridSpacing( gridSpacing );
    }
}

