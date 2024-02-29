package am.plotnikov.jackson.dto;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record Request(
        Courier courier
) {
}
