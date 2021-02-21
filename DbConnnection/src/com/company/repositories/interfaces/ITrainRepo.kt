package com.company.repositories.interfaces;

import com.company.entities.Train;
import com.company.entities.User;

import java.util.List;

interface ITrainRepo {
    boolean createTrain(Train train);
    Train getTrainById(int id);
    List<Train> getAllTrains();
    Train getTrainByLocomotiveId(int locomotiveId);
}