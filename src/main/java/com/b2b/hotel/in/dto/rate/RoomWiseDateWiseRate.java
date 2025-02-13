package com.b2b.hotel.in.dto.rate;

import com.b2b.hotel.in.dto.rate.enums.CancellationPolicyType;
import com.b2b.hotel.in.dto.rate.enums.InclusionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@RequiredArgsConstructor
@AllArgsConstructor
public class RoomWiseDateWiseRate {


    private String roomType;
    private String maxPax;
    private String childCompAge;
    private String noOfRooms;
    private InclusionType inclusion;    //enum
    private CancellationPolicyType cancellationPolicy; //enum
    private String cancellationBeforeDays;
    private Map<InclusionType, Map<LocalDate, RoomPricingData>> roomRateInclusionWise;

}
