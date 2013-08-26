/*
 * @(#)InputStreamAdapter.java	1.13 10/03/23
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.imageio.plugins.common;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.stream.ImageInputStream;

/**
 * @version 0.5
 */
public class InputStreamAdapter extends InputStream {
    
    ImageInputStream stream;

    public InputStreamAdapter(ImageInputStream stream) {
        super();

        this.stream = stream;
    }

    public int read() throws IOException {
        return stream.read();
    }

    public int read(byte b[], int off, int len) throws IOException {
        return stream.read(b, off, len);
    }
}
