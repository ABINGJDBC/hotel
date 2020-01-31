package com.face.hotel.service.impl;

import com.face.hotel.entity.VehicleInfo;
import com.face.hotel.mapper.VehicleInfoMapper;
import com.face.hotel.service.VehicleInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Institution csust
 * @Author MeiyuJijieYihou
 * @Description Waiting fo development.
 * @Date 2020/1/23 下午5:23
 */
@Service
public class VehicleInfoServiceImpl implements VehicleInfoService {


    @Resource
    VehicleInfoMapper vehicleInfoMapper;

    public List<VehicleInfo> getAllVehicleInfo() {

        List<VehicleInfo> vehicleInfos = vehicleInfoMapper.selectAllVehicleInfo();
        return vehicleInfos;
    }
}
