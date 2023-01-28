<template>
  <el-main>
    <div>
      <router-view v-slot="{ Component }">
        <component :is="Component"/>
      </router-view>
    </div>
  </el-main>

  <!--  <component :is="HelloWorld"/>-->
</template>

<script setup>
import HelloWorld from "../../components/HelloWorld.vue";
</script>

<style scoped>

</style>
