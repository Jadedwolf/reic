// $Id$
/*
 * ReIC integrated circuits
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.reic.util;

import org.bukkit.Chunk;

public class ChunkCoord {

    private int x;
    private int z;

    public ChunkCoord() {
    }

    public ChunkCoord(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public ChunkCoord(Chunk chunk) {
        this(chunk.getX(), chunk.getZ());
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ChunkCoord)) {
            return false;
        }

        ChunkCoord other = (ChunkCoord) obj;
        return this.x == other.x && this.z == other.z;
    }

    public int hashCode() {
        return this.x + this.z << 16;
    }

}