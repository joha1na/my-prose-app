/*
 * My Prose App - A Java project demonstrating text composition
 * Copyright (c) 2025 Jana Maire
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.Prose;

/**
 * A simple implementation of the Prose interface.
 * This class provides an immutable prose text that can be used as a basic
 * text container in the prose composition system. The text content is
 * initialized upon creation and remains constant throughout the object's lifecycle.
 * 
 * @author Jana Maire
 * @version 1.0.0
 * @see de.htw_berlin.fb4.ossd.prose.Prose
 */
public class SimpleProse implements Prose {
    private String text = "Dies ist ein einfacher Prose-Text, der die Prose-Schnittstelle implementiert.";

    /**
     * Returns the text content of this prose object.
     * This method implements the {@link Prose#get()} method from the Prose interface.
     * 
     * @return The prose text as a String, which is immutable for this implementation
     */
    @Override
    public String get() {
        return text;
    }
}
