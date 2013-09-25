/*******************************************************************************
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *******************************************************************************/
package dkpro.similarity.algorithms.lexical.string;

import com.wcohen.ss.Jaro;
import com.wcohen.ss.Level2Jaro;

public class JaroSecondStringComparator
    extends SecondStringComparator_ImplBase
{
    public JaroSecondStringComparator()
    {
            secondStringMeasureL1 = new Jaro();
            secondStringMeasureL2 = new Level2Jaro();
    }
}