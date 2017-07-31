package com.hribol.bromium.record;

import com.google.inject.Inject;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.SUBMIT_EVENT_URL;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordRequestFilter implements RequestFilter {
    private RecordingState recordingState;

    @Inject
    public RecordRequestFilter(RecordingState recordingState) {
        this.recordingState = recordingState;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (httpRequest.getUri().contains(SUBMIT_EVENT_URL)) {
            try {
                Map<String, String> map = ConfigurationUtils.splitQuery(new URL(httpRequest.getUri()));
                recordingState.storeTestCaseStep(map);
                System.out.println(map);
            } catch (UnsupportedEncodingException | MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}