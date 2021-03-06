/*
 * Copyright � 2015 Intel Corporation
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0,
 *  which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html . https://github.com/viqet
 *  Contributors:
 *     Intel Corporation - initial API and implementation and/or initial documentation
 */

package org.vqeg.viqet.cloud.Json;

public class ExamplePhotoResponse {

    private boolean acceptable;
    public boolean isAcceptable(){return acceptable;}

    private String blobFileName;
    public String getBlobFileName(){return blobFileName;}

    private String description;
    public String getDescription(){return description;}

    private String name;
    public String getName(){return name;}
}
