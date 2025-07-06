package com.mc3699.codmod.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Optional;

public class CodFoods {

    public static final FoodProperties BURGER =
            new FoodProperties(
                    8, 16, false,
                    1f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties BANANA =
            new FoodProperties(
                    2, 4, false,
                    0.8f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties BAGUETTE =
            new FoodProperties(
                    6, 12, false,
                    1.5f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties BUN =
            new FoodProperties(
                    4, 6, false,
                    0.5f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties CAKE =
            new FoodProperties(
                    10, 20, false,
                    3f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties CHEESE =
            new FoodProperties(
                    5, 4, false,
                    0.5f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties CHICKEN_NUGGET =
            new FoodProperties(
                    2, 5, false,
                    0.25f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties CHOCOLATE =
            new FoodProperties(
                    2, 8, false,
                    0.8f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties CUCUMBER = // I hate them too
            new FoodProperties(
                    3, 1, false,
                    2f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties FOOD_BOX =
            new FoodProperties(
                    8, 12, false,
                    1.5f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties LEMON =
            new FoodProperties(
                    2, 2, false,
                    1f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties MANGO = // EAT THE MANGO
            new FoodProperties(
                    4, 1, false,
                    0.8f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties MRE =
            new FoodProperties(
                    20, 40, false,
                    3f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties ORANGE =
            new FoodProperties(
                    2, 3, false,
                    1f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties PIZZA =
            new FoodProperties(
                    10, 16, false,
                    3.5f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties TACO =
            new FoodProperties(
                    6, 6, false,
                    1f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties TOMATO =
            new FoodProperties(
                    4, 4, false,
                    0.6f, Optional.of(ItemStack.EMPTY), List.of()
            );

    public static final FoodProperties ROUND_MEAL =
            new FoodProperties.Builder()
                    .nutrition(1997)
                    .saturationModifier(2000f)
                    .alwaysEdible()
                    .effect(new MobEffectInstance(MobEffects.SATURATION, 600, 255), 1)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 255), 1)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 255), 1)
                    .build();
}
