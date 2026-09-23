package com.sprint.mission.discodeit.dto;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.UUID;

public record UserStatusUpdateByUserIdRequest(
        @NotNull
        UUID userId,
        @NotNull
        Instant lastActiveAt) {
}
