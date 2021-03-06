package com.enonic.lib.textencoding;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.common.io.ByteSource;

import com.enonic.xp.testing.script.ScriptRunnerSupport;

public class TextEncodingHexScriptLibTest
    extends ScriptRunnerSupport
{
    @Override
    public String getScriptTestFile()
    {
        return "site/lib/text-encoding-hex-test.js";
    }

    public ByteSource getTestStream( final String text )
    {
        return ByteSource.wrap( text.getBytes( StandardCharsets.UTF_8 ) );
    }

    public String streamAsUtf8( final ByteSource bs )
        throws IOException
    {
        return new String( bs.read(), StandardCharsets.UTF_8 );
    }

}
