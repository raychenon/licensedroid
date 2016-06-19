package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 *         https://opensource.org/licenses/LGPL-2.1
 */
public class LGPL21License extends LicenseInfos {
    @Override
    public String getName() {
        return "The GNU Lesser General Public License, version 2.1 (LGPL-2.1)";
    }

    @Override
    public String getDescription() {
        return "his library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version.\n" +
                "\n" +
                "This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.\n" +
                "\n" +
                "You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA";
    }

    // TODO replace by library's idea
    public String getCopyrightFormat() {
        return String.format("<one line to give the library's name and an idea of what it does.> Copyright (C) %s %s", YEAR, COPYRIGHT_HOLDER);
    }
}
