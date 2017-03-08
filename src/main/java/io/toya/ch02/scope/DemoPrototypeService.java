package io.toya.ch02.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Sai on 2017/3/8.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
