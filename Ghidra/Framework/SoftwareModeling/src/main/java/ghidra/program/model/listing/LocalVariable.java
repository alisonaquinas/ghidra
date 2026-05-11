/* ###
 * IP: GHIDRA
 * REVIEWED: YES
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.program.model.listing;

/**
 * Represents a local (non-parameter) variable within a function body.
 * <p>
 * Local variables are scoped to a function and are associated with a first-use offset — the
 * instruction offset within the function at which the variable first comes into scope.
 * Unlike parameters, local variables do not occupy a position in the function signature.
 *
 * @see Variable
 * @see Parameter
 */
public interface LocalVariable extends Variable {
    /**
     * Set the first use offset.
     * @param firstUseOffset
     * @return true if successful, else false
     */
    public boolean setFirstUseOffset(int firstUseOffset);
}
