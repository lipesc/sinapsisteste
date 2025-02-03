<script setup>
import { defineProps } from 'vue';

const props = defineProps({
  substacoes: Array
});
</script>

<template>
  <div v-if="substacoes.length">
    <div v-for="substacao in substacoes" :key="substacao.idSubstacao">
      <p>{{ substacao.codigo }} - {{ substacao.nome }}</p>
      <p>Latitude: {{ substacao.latitude }}</p>
      <p>Longitude: {{ substacao.longitude }}</p>
    </div>
  </div>
  <div v-else>
    <p>No data available</p>
  </div>
</template>