package com.mycompany;

import com.mycompany.grpc.KeyboardMessage.Keyboard;
import com.mycompany.grpc.ProcessorMessage;

import java.security.Key;
import java.util.Random;

public class Generator
{
    private Random random;

    public Generator()
    {
        random = new Random();
    }

    public Keyboard NewKeyboard()
    {
        return Keyboard.newBuilder()
                .setLayout(getRandomLayout())
                .setBacklit(random.nextBoolean())
                .build();
    }

    public ProcessorMessage.CPU NewCPU()
    {
        String brand =
    }

    private Keyboard.Layout getRandomLayout()
    {
        switch (random.nextInt(3))
        {
            case 1: return Keyboard.Layout.QUERTY;
            case 2: return Keyboard.Layout.QWERTZ;
            default: return Keyboard.Layout.AZERTY;
        }
    }
}
