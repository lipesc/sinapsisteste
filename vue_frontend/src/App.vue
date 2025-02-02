<script setup>
import HelloWorld from './components/HelloWorld.vue'
import { ref } from 'vue';
import { useToast } from "vue-toastification";

const toast = useToast();
const substacoes = ref([]);
const fetchData = async () => {
  try {
    const response = await fetch('http://localhost:5000/testando');
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    const data = await response.json();
    substacoes.value = data;
    toast.success("Successfully fetched data from Spring", {
      timeout: 2000
    });
  } catch (error) {
    toast.error(error.message);
  }
};

fetchData();

</script> 

<template>

  <HelloWorld :substacoes="substacoes" />
</template>

<style scoped>

</style>

